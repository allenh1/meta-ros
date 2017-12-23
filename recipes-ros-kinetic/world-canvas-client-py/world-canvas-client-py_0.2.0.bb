# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python client library to access semantic maps within the world canvas framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-pymongo roslib rospy visualization-msgs world-canvas-msgs"
SRC_URI = "https://github.com/yujinrobot-release/world_canvas_libs-release/archive/release/kinetic/world_canvas_client_py/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e86ea2f45d85a9ae85682aecf687514"
SRC_URI[sha256sum] = "03190beaff03e0dcc9102ee6ec48051ed0252ac3744e90cdf2bce10359e3f3b6"
S = "${WORKDIR}/world_canvas_libs-release-release-kinetic-world_canvas_client_py-0.2.0-0"

inherit catkin

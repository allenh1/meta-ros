# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_py_console is a Python GUI plugin providing an interactive Python console."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-qt-binding qt-gui qt-gui-py-common rospy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_py_console-release/archive/release/kinetic/rqt_py_console/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2028f929bf00d4a1286c4b39d3610de4"
SRC_URI[sha256sum] = "dc6a7cfe4cea3d4956723169b8c0a942407abef422390e0af42fa3a3ddb291e8"
S = "${WORKDIR}/rqt_py_console-release-release-kinetic-rqt_py_console-0.4.8-0"

inherit catkin

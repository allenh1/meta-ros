# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The joy_mouse package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-pyudev rospy sensor-msgs"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/joy_mouse/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f8c61530cbb917666ae6ef8197791bae"
SRC_URI[sha256sum] = "02bd4ddb6ed7ab7493ff9b5c1e6bf427554808d8036e5b060617476508dd9317"
S = "${WORKDIR}/jsk_control-release-release-kinetic-joy_mouse-0.1.13-0"

inherit catkin

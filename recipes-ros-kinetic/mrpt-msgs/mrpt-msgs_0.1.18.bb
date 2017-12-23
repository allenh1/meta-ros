# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for MRPT classes and objects"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/kinetic/mrpt_msgs/0.1.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "43e0e72f6c252ec0dec20de846e50169"
SRC_URI[sha256sum] = "0ead0c62a66271551683077a70cb3a36696b63dcc6a9bb58f6ac358e8d65dc07"
S = "${WORKDIR}/mrpt_navigation-release-release-kinetic-mrpt_msgs-0.1.18-0"

inherit catkin

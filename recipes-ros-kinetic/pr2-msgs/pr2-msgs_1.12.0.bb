# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for representing PR2 state, such as battery information and the PR2 fin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/kinetic/pr2_msgs/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "99a5c59d8f2ba48ea52a430526d5b3ec"
SRC_URI[sha256sum] = "f4fbe9f6658f0ca16abc0c6a0cf96bb3a251e396e953ebf5da476578fac3996b"
S = "${WORKDIR}/pr2_common-release-release-kinetic-pr2_msgs-1.12.0-0"

inherit catkin

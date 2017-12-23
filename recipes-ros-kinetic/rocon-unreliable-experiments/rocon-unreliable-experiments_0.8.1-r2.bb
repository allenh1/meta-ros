# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Some experiments testing roscpp unreliable transports."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_multimaster-release/archive/release/kinetic/rocon_unreliable_experiments/0.8.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cab249d95962c9254c9e7a64a96d8847"
SRC_URI[sha256sum] = "de5201287fc6fbdb208d06a0de7cef153df87fb69e046c7fd315697fac8db789"
S = "${WORKDIR}/rocon_multimaster-release-release-kinetic-rocon_unreliable_experiments-0.8.1-2"

inherit catkin

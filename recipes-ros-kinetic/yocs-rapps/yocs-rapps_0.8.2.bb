# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Yujin open control system rapps for use with the app manager and rocon concert"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native yocs-velocity-smoother"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_rapps/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0b33036117115dce1ea96b3c348fe368"
SRC_URI[sha256sum] = "18a2b15a820ba5f6d44df3a0e68cfd0a80041b9ad817794e3182cc9d1d48d26e"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_rapps-0.8.2-0"

inherit catkin

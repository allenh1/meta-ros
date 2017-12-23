# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This doesn't do everything you need for multimaster, however it does     provide"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rocon-gateway rocon-gateway-tests rocon-gateway-utils rocon-hub rocon-hub-client rocon-test rocon-unreliable-experiments"
SRC_URI = "https://github.com/yujinrobot-release/rocon_multimaster-release/archive/release/kinetic/rocon_multimaster/0.8.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d145b5247426ae48ec4fe1e387ee86b"
SRC_URI[sha256sum] = "d75d660fbcbf425976978defb7e76ba459e55d460760316ab27907e838fb7fce"
S = "${WORKDIR}/rocon_multimaster-release-release-kinetic-rocon_multimaster-0.8.1-2"

inherit catkin

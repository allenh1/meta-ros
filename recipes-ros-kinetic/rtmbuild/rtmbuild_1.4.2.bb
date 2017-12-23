# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Build scripts for OpenRTM and OpenHRP"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules libblas-dev liblapack-dev message-generation message-runtime omniorb openrtm-aist openrtm-aist-python pkgconfig rostest std-msgs"
SRC_URI = "https://github.com/tork-a/rtmros_common-release/archive/release/kinetic/${PN}/1.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "59b90a8c69102bcecaf0a50512682881"
SRC_URI[sha256sum] = "f1b6875c8899df1fa9d07b2ebb2c9ed25bf88e76b8bb38840d6dddb41f4342ef"
S = "${WORKDIR}/rtmros_common-release-release-kinetic-${PN}-1.4.2-0"

inherit catkin

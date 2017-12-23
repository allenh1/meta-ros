# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "julius: Open-Source Large Vocabulary CSR Engine (http://julius.sourceforge.jp/in"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "catkin-native mk roslib rospack rsync unzip"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/${PN}/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fdfd8990a9bcf51a94ecd5628fbbf04f"
SRC_URI[sha256sum] = "cc86abfece6dd45224d173af6a4f8a2e594c25d3140565e14523c759b24bbaeb"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-${PN}-2.1.6-0"

inherit catkin

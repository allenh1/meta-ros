# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The metapackage to combine the nodes required to establish and manage a multimas"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native default-cfg-fkie master-discovery-fkie master-sync-fkie multimaster-msgs-fkie node-manager-fkie"
SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/kinetic/multimaster_fkie/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0e7ee9a7fb9703370dcff2cefe30662c"
SRC_URI[sha256sum] = "a559f52a1785b1e3a4e1ab0a3ec0098c84d48f9b1f35ae5c374a7816e5657eb7"
S = "${WORKDIR}/multimaster_fkie-release-release-kinetic-multimaster_fkie-0.7.7-0"

inherit catkin

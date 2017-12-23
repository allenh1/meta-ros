# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "assimp library"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost ca-certificates catkin-native git mk openssl rosboost-cfg rosbuild unzip zlib"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/assimp_devel/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "28c82ab61925299fcddb7c6015f93d92"
SRC_URI[sha256sum] = "e95629eb3b6bc98d1755c59e208c2c2dfe0982607f020e8984f85c952ebd6f5c"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-assimp_devel-2.1.6-0"

inherit catkin

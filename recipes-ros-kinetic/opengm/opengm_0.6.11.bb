# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package wraps the external c++ library opengm in a ROS package, so other pa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=1a58895467feb5b42724abbf3f0d9612"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/kinetic/${PN}/0.6.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "34eefe77b8e44f4d59e85715ac1ece46"
SRC_URI[sha256sum] = "02d5dbd4476a7daeb85f1d7dc085c9a2baddd59cb5673310a25b138d1d2c5f5a"
S = "${WORKDIR}/cob_extern-release-release-kinetic-${PN}-0.6.11-0"

inherit catkin

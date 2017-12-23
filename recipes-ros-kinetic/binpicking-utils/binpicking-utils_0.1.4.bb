# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Binpicking utils metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bin-pose-emulator bin-pose-msgs catkin-native"
SRC_URI = "https://github.com/durovsky/binpicking_utils-release/archive/release/kinetic/binpicking_utils/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "23e0ec9628139cb8f951ad07e9919879"
SRC_URI[sha256sum] = "071610a5af5c02f6880d49c4af301c3d7e80557d7b41eaec8742f7d24aa659fe"
S = "${WORKDIR}/binpicking_utils-release-release-kinetic-binpicking_utils-0.1.4-0"

inherit catkin

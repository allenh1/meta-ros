# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Some fast/convenient type converters, mostly for char strings or strings.      T"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-concepts ecl-config ecl-errors ecl-exceptions ecl-license ecl-mpl ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_converters/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5a81de8547d2d4564daafa874ca4ac33"
SRC_URI[sha256sum] = "88b6bc078843e94363cd3888a84c16d38d0c5ac077b46fe714a8ae73da054e46"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_converters-0.61.17-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metaprogramming tools move alot of runtime calculations to be shifted to     com"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_mpl/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "82d927c82eea3829d538313904af419f"
SRC_URI[sha256sum] = "6ce178d9b883052c5786f28df3686ffe1d7f6e427eb784585668d2a128f3d891"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_mpl-0.61.17-0"

inherit catkin

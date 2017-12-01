# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_string_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_string_util/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dd7915bb2dad7664a9bdebad2d321513"
SRC_URI[sha256sum] = "8d4992ddcdc2a66dfa71b4708459df28d528677371cc2643b42fcf2f22eb6eae"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_string_util-1.2.0-0"

inherit catkin

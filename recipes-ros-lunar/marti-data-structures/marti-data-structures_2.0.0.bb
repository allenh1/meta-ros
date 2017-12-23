# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_data_structures"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/marti_data_structures/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fd849ffb9aa33e4f9c6a98136ebfbca6"
SRC_URI[sha256sum] = "2a14d9f4942fa64358823c9294ee637f2a5cba81b3ee8d8137286ad95ca93b85"
S = "${WORKDIR}/marti_common-release-release-lunar-marti_data_structures-2.0.0-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_data_structures"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/marti_data_structures/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "245771cefec24db57f2ea4d6c7964412"
SRC_URI[sha256sum] = "6ea56f4713f80c973071d32b6b32d02b9aeb3a6ff6f40d101c892c113fdaafa0"
S = "${WORKDIR}/marti_common-release-release-lunar-marti_data_structures-0.3.0-0"

inherit catkin

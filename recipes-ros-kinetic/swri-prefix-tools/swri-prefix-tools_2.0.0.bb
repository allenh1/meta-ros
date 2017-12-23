# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains scripts that are useful as prefix commands for nodes     started by ros"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-psutil"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_prefix_tools/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b197f5e031387d48b68daabeee16b501"
SRC_URI[sha256sum] = "3db768040d7cff0bcee9b592dc9df68b0ee1e0214b44546ea432dc21ce9b4062"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_prefix_tools-2.0.0-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a simple script to write simple launch files     that can "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet rosbash roscpp std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_nodelet/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d2db5e6eee9959816bdf968bb343bf4"
SRC_URI[sha256sum] = "96f7bb9c176dae7f7f414e7ecf1b21ca34b0396a86276658d0963dfe8142f80f"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_nodelet-2.0.0-0"

inherit catkin

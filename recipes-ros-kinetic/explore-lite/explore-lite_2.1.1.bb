# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Lightweight frontier-based exploration."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native costmap-2d geometry-msgs map-msgs move-base-msgs nav-msgs roscpp std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/hrnr/m-explore-release/archive/release/kinetic/explore_lite/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "62a78ea0bad6640d73a51b6daecade28"
SRC_URI[sha256sum] = "5c662edd509409670e5b618a63a27417ab40defffdd824949fa1680df0442652"
S = "${WORKDIR}/m-explore-release-release-kinetic-explore_lite-2.1.1-0"

inherit catkin

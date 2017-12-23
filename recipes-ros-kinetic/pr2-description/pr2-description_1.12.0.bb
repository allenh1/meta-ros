# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the description (mechanical, kinematic, visual,   etc.) of"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native convex-decomposition ivcon xacro"
SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/kinetic/pr2_description/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f6e28093708d2d62b98f2e8b610b15d8"
SRC_URI[sha256sum] = "f3d47c61cf5fb3e93f287315b27476a787a1d0ce1074cf7a1d4c641b3a54fdf6"
S = "${WORKDIR}/pr2_common-release-release-kinetic-pr2_description-1.12.0-0"

inherit catkin

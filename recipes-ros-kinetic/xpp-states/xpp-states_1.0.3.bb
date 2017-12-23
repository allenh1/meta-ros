# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common definitions (positions, velocities, angular angles,     angular rates) an"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/kinetic/xpp_states/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24d91781c7ac441456c65773fc82e985"
SRC_URI[sha256sum] = "cc98c3b2a2d0b75761fefef518983bef633cf3d9c75d539ead3543d981d004b7"
S = "${WORKDIR}/xpp-release-release-kinetic-xpp_states-1.0.3-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF description of the robot kinematics and dynamics, 3D models of robot compon"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pr2-dashboard-aggregator pr2-description pr2-machine pr2-msgs"
SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/kinetic/pr2_common/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4ae6f83d890b29d14f881dd7ed19a24b"
SRC_URI[sha256sum] = "108c660abbffc79a38faf0217bdb07b7c73c52172d47efa0be89aff98f8bfd8a"
S = "${WORKDIR}/pr2_common-release-release-kinetic-pr2_common-1.12.0-0"

inherit catkin

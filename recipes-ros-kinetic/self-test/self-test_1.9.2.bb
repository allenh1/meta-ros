# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "self_test"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater roscpp rostest"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/kinetic/self_test/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4cd82c458f6569df1d8af3cda763f992"
SRC_URI[sha256sum] = "d33fa44cd51a0841d76b4586a3a65bc88ba02b2bf3c919fcc43e4fa890c43ceb"
S = "${WORKDIR}/diagnostics-release-release-kinetic-self_test-1.9.2-0"

inherit catkin

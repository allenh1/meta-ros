# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_roscpp"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin diagnostic-updater nav-msgs roscpp std-msgs std-srvs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_roscpp/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6e7aa71a525b0e03742e0505d2d72fa1"
SRC_URI[sha256sum] = "f2e68be56d1c8d0b73525aed88ebd38e9335e98095a63edfeddde28619d5e527"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_roscpp-2.0.0-0"

inherit catkin

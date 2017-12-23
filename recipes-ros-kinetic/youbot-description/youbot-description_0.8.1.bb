# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Robot descriptions in form of URDF files and meshes"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/youbot-release/youbot_description-release/archive/release/kinetic/youbot_description/0.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aa02ff8c0ec6135cd2b5a96a3b802d9d"
SRC_URI[sha256sum] = "9b5201f020d399264085c9ea1f0f318149583bd8eb39cbb95c9b28f6008c534f"
S = "${WORKDIR}/youbot_description-release-release-kinetic-youbot_description-0.8.1-0"

inherit catkin

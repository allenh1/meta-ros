# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for TivaC Launchpad evaluation boards."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin rosserial-client rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_tivac/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5efd38befeffe0551e5d4961b7f69fff"
SRC_URI[sha256sum] = "523c54c036cf87b56a252208c36b3f819cccdfe7e3baed57fb7144a4026db6bd"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_tivac-0.7.7-0"

inherit catkin

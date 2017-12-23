# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for the robotis_framework (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robotis-controller robotis-device robotis-framework-common"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-Framework-release/archive/release/kinetic/robotis_framework/0.2.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "75ad7f1e9dfbd4e455666d2502adeed0"
SRC_URI[sha256sum] = "e09d06cb988a95ec2188672e48a3c4364719ae065a058c9ad9723c4b384e7ecd"
S = "${WORKDIR}/ROBOTIS-Framework-release-release-kinetic-robotis_framework-0.2.6-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The package contains commonly used Headers for the ROBOTIS Framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robotis-device roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-Framework-release/archive/release/kinetic/robotis_framework_common/0.2.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ff09ede2942600faa96900189d970623"
SRC_URI[sha256sum] = "0a0fcbeb5a31753b3eeea0ca5269e1d7eac6e538eb90e8447c043892493c5fae"
S = "${WORKDIR}/ROBOTIS-Framework-release-release-kinetic-robotis_framework_common-0.2.6-0"

inherit catkin

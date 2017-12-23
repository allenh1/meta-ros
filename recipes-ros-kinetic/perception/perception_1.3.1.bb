# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native image-common image-pipeline image-transport-plugins laser-pipeline perception-pcl ros-base vision-opencv"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/kinetic/${PN}/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "053fc15bcc6d2cd4d9d927a5149219c8"
SRC_URI[sha256sum] = "86383154ca95d0b9f491529992ceeb53b673086057c1fba04ee3977bf913064b"
S = "${WORKDIR}/metapackages-release-release-kinetic-${PN}-1.3.1-0"

inherit catkin

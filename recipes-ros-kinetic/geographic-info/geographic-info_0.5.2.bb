# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Geographic information metapackage.      Not needed for wet packages, use only t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geodesy geographic-msgs"
SRC_URI = "https://github.com/ros-${PN}/geographic_info-release/archive/release/kinetic/geographic_info/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "47c3046cbe74206a4f1ad9bc44dd5456"
SRC_URI[sha256sum] = "d48283a19ec7929cb22cccbb524dc6dce692f97608e980bf92292179d0411d6c"
S = "${WORKDIR}/geographic_info-release-release-kinetic-geographic_info-0.5.2-0"

inherit catkin

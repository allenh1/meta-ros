# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Placeholder package enabling generic export of media paths."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=54fd73f111eb340e3f0cd303c5c376cc"

DEPENDS = "catkin"
SRC_URI = "https://github.com/ros-gbp/media_export-release/archive/release/lunar/media_export/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "07570488cd8432bb92c973bb8ec30738"
SRC_URI[sha256sum] = "7844eebcffe91baa46928e6ba28a4e4c5662d012adbadd13974a3d4139a3d395"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

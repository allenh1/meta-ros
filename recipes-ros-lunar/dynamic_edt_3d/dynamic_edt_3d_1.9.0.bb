# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The dynamicEDT3D library implements an inrementally updatable Euclidean distance"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=b5e456807aed515cccd033d5646f74d7"

DEPENDS = "catkin cmake octomap"
SRC_URI = "https://github.com/ros-gbp/octomap-release/archive/release/lunar/dynamic_edt_3d/1.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "96b48ac3861456a54334483bb3a4ca63"
SRC_URI[sha256sum] = "49d82aa634d7f1c95335fab2b88678bc45e53a8f2972679d955494cac52ca500"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

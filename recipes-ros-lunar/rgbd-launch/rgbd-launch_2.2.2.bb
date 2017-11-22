# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files to open an RGBD device and load all nodelets to       convert raw d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin depth-image-proc image-proc nodelet tf2-ros"
SRC_URI = "https://github.com/ros-gbp/rgbd_launch-release/archive/release/lunar/rgbd_launch/2.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c4a4ad0bccd0910e13566705cf298a0"
SRC_URI[sha256sum] = "ed26e8037787008bfc0746ff88ec9954f3afd58de9a35bb33585c2afc18a095f"
S = "${WORKDIR}/rgbd_launch-release-release-lunar-rgbd_launch-2.2.2-0"

inherit catkin

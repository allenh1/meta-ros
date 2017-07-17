# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files to open an RGBD device and load all nodelets to 
     convert raw d"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=a7f6d5263f7e845407d6f8c3d125eddf"

DEPENDS = "catkin depth_image_proc image_proc nodelet tf2_ros"
SRC_URI = "https://github.com/ros-gbp/rgbd_launch-release/archive/release/lunar/rgbd_launch/2.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c4a4ad0bccd0910e13566705cf298a0"
SRC_URI[sha256sum] = "ed26e8037787008bfc0746ff88ec9954f3afd58de9a35bb33585c2afc18a095f"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

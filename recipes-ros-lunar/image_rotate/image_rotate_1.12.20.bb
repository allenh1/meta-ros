# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=62bdbdd5283e4ca7316f7ec14f341330"

DEPENDS = "catkin cmake_modules cv_bridge dynamic_reconfigure geometry_msgs image_transport nodelet roscpp tf2 tf2_geometry_msgs tf2_ros"
SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/lunar/image_rotate/1.12.20-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f4dc6480abdd74451b3353fa1225941c"
SRC_URI[sha256sum] = "fd3772a417b799e8233f0890b060aba34877530f2be2f6420e73f4f3a5cda193"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

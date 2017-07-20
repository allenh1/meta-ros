# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roscpp_traits contains the message traits code as described in     .      This p"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cpp-common rostime"
SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/lunar/roscpp_traits/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c01b0401a2172aca90e4c0f6b5e53483"
SRC_URI[sha256sum] = "982708f7bd56e611dbc34ca6120b7f4594f093445fd281e9657fd8e00175f051"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

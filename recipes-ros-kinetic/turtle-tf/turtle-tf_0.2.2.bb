# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtle_tf demonstrates how to write a tf broadcaster and listener with the turtl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roscpp rospy std-msgs tf turtlesim"
SRC_URI = "https://github.com/ros-gbp/geometry_tutorials-release/archive/release/kinetic/turtle_tf/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be01c409eb7d01d384dc4b7bcbfbaa3c"
SRC_URI[sha256sum] = "e5c783340ea80801232163ccb2fa8f949ba900901c97767a3d728a9e7bac15df"
S = "${WORKDIR}/geometry_tutorials-release-release-kinetic-turtle_tf-0.2.2-0"

inherit catkin

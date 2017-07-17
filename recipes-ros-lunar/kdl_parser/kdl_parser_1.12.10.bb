# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Kinematics and Dynamics Library (KDL) defines a tree structure
   to represe"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=919c45ce974020ff7346dc5ba5d895e2"

DEPENDS = "catkin cmake_modules orocos_kdl rosconsole roscpp rostest urdf"
SRC_URI = "https://github.com/ros-gbp/kdl_parser-release/archive/release/lunar/kdl_parser/1.12.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "af49fd3a440d4fbe872dee0d301ba87a"
SRC_URI[sha256sum] = "dd84cc01e18c6eeb177ed68ef625af6266bb3a75201fe4fa20c40f4f774f45ad"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

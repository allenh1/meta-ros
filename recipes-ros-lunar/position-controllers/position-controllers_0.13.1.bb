# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "position_controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin controller-interface forward-command-controller"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/position_controllers/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f2f13888d12b39b89dbef522bedfccca"
SRC_URI[sha256sum] = "f96ae8ced61196802788983434345c19557160a70236aede84e0336d354f6efa"
S = "${WORKDIR}/ros_controllers-release-release-lunar-position_controllers-0.13.1-0"

inherit catkin

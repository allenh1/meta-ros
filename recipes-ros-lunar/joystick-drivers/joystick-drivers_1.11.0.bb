# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage depends on packages for interfacing common     joysticks and hu"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin joy ps3joy spacenav-node wiimote"
SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/lunar/joystick_drivers/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0a1d98b0ecd2efc00a8c873ed8e91989"
SRC_URI[sha256sum] = "9ecded69160a45d91bb27acd33b8658325dfe4610a8286b7733fee4bd871f82e"
S = "${WORKDIR}/joystick_drivers-release-release-lunar-joystick_drivers-1.11.0-0"

inherit catkin

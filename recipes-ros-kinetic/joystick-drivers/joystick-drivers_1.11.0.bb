# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage depends on packages for interfacing common     joysticks and hu"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native joy ps3joy spacenav-node wiimote"
SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/kinetic/joystick_drivers/1.11.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ec40ac378deabf7671e87f049e10787"
SRC_URI[sha256sum] = "2d35c94aee579d940b7eafd5004da194b6e983623cf667deac06ddf6ac6d1153"
S = "${WORKDIR}/joystick_drivers-release-release-kinetic-joystick_drivers-1.11.0-0"

inherit catkin

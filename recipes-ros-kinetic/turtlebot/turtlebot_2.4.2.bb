# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The turtlebot meta package provides all the basic drivers for running and using "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native turtlebot-bringup turtlebot-capabilities turtlebot-description turtlebot-teleop"
SRC_URI = "https://github.com/${PN}-release/${PN}-release/archive/release/kinetic/${PN}/2.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "01966a56cca107a0c626b242353b1ea7"
SRC_URI[sha256sum] = "f15e3dd5703c00eadd9d6f490031cd87270380214b9e567a181c6a0330f185f9"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.4.2-0"

inherit catkin

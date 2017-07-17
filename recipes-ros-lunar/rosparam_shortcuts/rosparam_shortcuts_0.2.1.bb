# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Quickly load variables from rosparam with good command line error checking."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=d0df9c002a3048d143a7d63c7a128985"

DEPENDS = "catkin cmake_modules eigen eigen_conversions roscpp roslint"
SRC_URI = "https://github.com/davetcoleman/rosparam_shortcuts-release/archive/release/lunar/rosparam_shortcuts/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8de9b018e57f0e62a8475b8de0e1c210"
SRC_URI[sha256sum] = "9b66633dac39ecb2cf90ed53d3872170ef45e8f51c96591f8f4d5ff2338f601c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "OMPL is a free sampling-based motion planning library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake eigen pkgconfig"
SRC_URI = "https://github.com/ros-gbp/ompl-release/archive/release/lunar/ompl/1.3.2-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5891656de1e82abef3b7c0dad14a8dc"
SRC_URI[sha256sum] = "94e9a8cfa7ed706c2434e61795c36123d7682109d6c65e35ab4513307a27cfdc"
S = "${WORKDIR}/ompl-release-release-lunar-ompl-1.3.2-2"

inherit catkin

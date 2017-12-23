# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Twist multiplexer, which multiplex several velocity commands (topics) and       "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "CC-BY-NC-SA-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=6bc0e2b80b41b84c8240cea714dea709"

DEPENDS = "catkin-native diagnostic-updater geometry-msgs roscpp rostest std-msgs twist-mux-msgs visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/twist_mux-release/archive/release/kinetic/twist_mux/3.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f81e5d43eef8eb5bca97af4ff66a9deb"
SRC_URI[sha256sum] = "dcbf3f46aa024404abaca50eb5fbfdbd47834e16dc274bf479323781818061f8"
S = "${WORKDIR}/twist_mux-release-release-kinetic-twist_mux-3.0.0-0"

inherit catkin

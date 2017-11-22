# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The teb_local_planner_tutorials package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "amcl catkin map-server move-base stage-ros teb-local-planner"
SRC_URI = "https://github.com/rst-tu-dortmund/teb_local_planner_tutorials-release/archive/release/lunar/teb_local_planner_tutorials/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d0565f17397942141e5abc7fb4aab478"
SRC_URI[sha256sum] = "f98b4db75057060a9ff86f42b9acae341a998767712c13669136469e6ff3c09d"
S = "${WORKDIR}/teb_local_planner_tutorials-release-release-lunar-teb_local_planner_tutorials-0.2.1-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "map_server provides the  ROS , which offers map data as a ROS . It also provides"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=d6eaa875c2449a486edc1dd617b9fceb"

DEPENDS = "catkin nav_msgs roscpp rostest sdl-image tf yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/lunar/map_server/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "51a06154160d3f0b35372925e771e215"
SRC_URI[sha256sum] = "85f5393522e4a5f2aec7aff18b8b8dba065bee8f38756ba16118f325a0c07b47"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

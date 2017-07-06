# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin roslaunch roslint"
SRC_URI = "https://github.com/ros-gbp/xacro-release/archive/release/lunar/xacro/1.12.0-1.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a1ab44ac8131cbea3d80ed758fbcaeaa"
SRC_URI[sha256sum] = "c1d072e08302cf630e01cdabd24af1cc219b44987466078e005deff44876e255"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

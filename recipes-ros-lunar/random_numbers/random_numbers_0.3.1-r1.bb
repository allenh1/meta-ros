# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "boost catkin"
SRC_URI = "https://github.com/ros-gbp/random_numbers-release/archive/release/lunar/random_numbers/0.3.1-1.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "564105d4b53597f358cc80c31bfec829"
SRC_URI[sha256sum] = "509845f46f8d131433413130dc704c31e64353dfcf77afe9e89f9849caf19910"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

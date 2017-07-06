# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=9410a10dc7d8d68a78f94b401d4efc9b"

DEPENDS = "catkin rosemacs roslisp sbcl slime_wrapper"
SRC_URI = "https://github.com/code-iai-release/ros_emacs_utils-release/archive/release/lunar/slime_ros/0.4.11-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d3405a6ae126e615cff864b22e26af17"
SRC_URI[sha256sum] = "f29e43c3f5554bdfe359e100cdb8d750d4e3495cca69b129c97a41e38d54e86f"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

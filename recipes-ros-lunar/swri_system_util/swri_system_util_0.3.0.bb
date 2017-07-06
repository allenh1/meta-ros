# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin roscpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_system_util/0.3.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca4e05e344201be1a5b34999f12bcc4a"
SRC_URI[sha256sum] = "9eacfc596cf3a3bb160a1d523070253bc397792a21dd4abae601b93da153ba8f"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

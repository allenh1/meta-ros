# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-psutil"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_prefix_tools/0.3.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cd37d3558e9b2aab6ed0571c8ab9d0e0"
SRC_URI[sha256sum] = "bca3d15b32ce76c15731f3d9122b093c2952f65e93a7f7ce1af4332714bb4aab"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
